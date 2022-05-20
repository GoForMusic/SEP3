using Microsoft.EntityFrameworkCore.Migrations;

#nullable disable

namespace EFC.Migrations
{
    public partial class fix : Migration
    {
        protected override void Up(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Bookmarks_Posts_PostId",
                table: "Bookmarks");

            migrationBuilder.DropForeignKey(
                name: "FK_Bookmarks_Users_Username",
                table: "Bookmarks");

            migrationBuilder.DropIndex(
                name: "IX_Bookmarks_PostId",
                table: "Bookmarks");

            migrationBuilder.DropIndex(
                name: "IX_Bookmarks_Username",
                table: "Bookmarks");

            migrationBuilder.AddColumn<string>(
                name: "Username1",
                table: "Bookmarks",
                type: "text",
                nullable: true);

            migrationBuilder.CreateIndex(
                name: "IX_Bookmarks_Username1",
                table: "Bookmarks",
                column: "Username1");

            migrationBuilder.AddForeignKey(
                name: "FK_Bookmarks_Users_Username1",
                table: "Bookmarks",
                column: "Username1",
                principalTable: "Users",
                principalColumn: "Username");
        }

        protected override void Down(MigrationBuilder migrationBuilder)
        {
            migrationBuilder.DropForeignKey(
                name: "FK_Bookmarks_Users_Username1",
                table: "Bookmarks");

            migrationBuilder.DropIndex(
                name: "IX_Bookmarks_Username1",
                table: "Bookmarks");

            migrationBuilder.DropColumn(
                name: "Username1",
                table: "Bookmarks");

            migrationBuilder.CreateIndex(
                name: "IX_Bookmarks_PostId",
                table: "Bookmarks",
                column: "PostId");

            migrationBuilder.CreateIndex(
                name: "IX_Bookmarks_Username",
                table: "Bookmarks",
                column: "Username");

            migrationBuilder.AddForeignKey(
                name: "FK_Bookmarks_Posts_PostId",
                table: "Bookmarks",
                column: "PostId",
                principalTable: "Posts",
                principalColumn: "Id",
                onDelete: ReferentialAction.Cascade);

            migrationBuilder.AddForeignKey(
                name: "FK_Bookmarks_Users_Username",
                table: "Bookmarks",
                column: "Username",
                principalTable: "Users",
                principalColumn: "Username",
                onDelete: ReferentialAction.Cascade);
        }
    }
}
