package os.org.example.coreapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@RequestMapping("/api/health")
public class HealthCheckController {

    @GetMapping
    public ResponseEntity<Payload> status() {
        return ResponseEntity.ok(
                new Payload(
                        "core-api",
                        "UP",
                        Instant.now(),
                        "CI/CD Pipeline is up and running"
                )
        );
    }
}
