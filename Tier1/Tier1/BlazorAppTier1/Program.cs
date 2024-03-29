using BlazorAppForum.Authentication;
using BlazorAppTier1.Authentication;
using Contracts;
using HttpServices;
using Microsoft.AspNetCore.Builder;
using Microsoft.AspNetCore.Components.Authorization;
using Microsoft.Extensions.DependencyInjection;
using Microsoft.Extensions.Hosting;

var builder = WebApplication.CreateBuilder(args);

// Add services to the container.
builder.Services.AddRazorPages();
builder.Services.AddServerSideBlazor();

//add scopes
builder.Services.AddScoped<AuthenticationStateProvider, SimpleAuthenticationStateProvider>();
builder.Services.AddScoped<IAuthService, AuthServiceImpl>();

builder.Services.AddScoped<IBookmarkService, BookmarkHttpClient>();
builder.Services.AddScoped<IUserService, UserHttpClient>();
builder.Services.AddScoped<IAuthService, AuthServiceImpl>();
builder.Services.AddScoped<IPostService, PostHttpClient>();
builder.Services.AddScoped<ICommentService, CommentHttpClient>();
builder.Services.AddScoped<IReportService, ReportHttpsCLient>();
builder.Services.AddScoped<IRateService, RatingHttpClient>();

builder.Services.AddAuthorization(options =>
{
    options.AddPolicy("Admin", pb => pb.RequireAuthenticatedUser().RequireClaim("Role", "Admin"));
    options.AddPolicy("User",
        a => a.RequireAuthenticatedUser().RequireClaim("Role", "User"));
    options.AddPolicy("All",pb => pb.RequireAuthenticatedUser().RequireClaim("Role", "User", "Admin"));
});

var app = builder.Build();

// Configure the HTTP request pipeline.
if (!app.Environment.IsDevelopment()) {
    app.UseExceptionHandler("/Error");
    // The default HSTS value is 30 days. You may want to change this for production scenarios, see https://aka.ms/aspnetcore-hsts.
    app.UseHsts();
}

app.UseHttpsRedirection();

app.UseStaticFiles();

app.UseRouting();

app.MapBlazorHub();
app.MapFallbackToPage("/_Host");

app.Run();