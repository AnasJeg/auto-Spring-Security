package com.autoreservation.Authentification;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@CrossOrigin
public class AuthController {
    private final AuthService service;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(service.register(request));
    }
    @PostMapping("/login")
    public ResponseEntity<AuthResponse> authenticate(
            @RequestBody AuthRequest request
    ) {
        return ResponseEntity.ok(service.login(request));
    }

}
