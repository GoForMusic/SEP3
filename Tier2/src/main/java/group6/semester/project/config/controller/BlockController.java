package group6.semester.project.config.controller;

import group6.semester.project.model.Block;
import group6.semester.project.model.User;
import group6.semester.project.services.BlockService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BlockController {

    private final BlockService service;

    public BlockController(BlockService blockService) {
        this.service = blockService;
    }

    @PatchMapping(value = "/blockUser")
    public ResponseEntity blockUser(@RequestBody Block block) {
        try {
            User userFromServer = service.blockUser(block);
            return ResponseEntity.ok(userFromServer);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
        }

    }

    @PatchMapping(value = "/unBlockUser/{username}")
    public ResponseEntity unBlockUser(@PathVariable String username) {
        try {
            User userFromServer = service.unBlockUser(username);
            return ResponseEntity.ok(userFromServer);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
        }
    }

    @GetMapping (value = "/blockedUsers")

    public ResponseEntity getAllBlockedUsers(){
        try {
            List<Block> blockedUsers = service.getAllBlockedUsers();
            return ResponseEntity.ok(blockedUsers);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage(), HttpStatus.EXPECTATION_FAILED);
        }
    }
}
