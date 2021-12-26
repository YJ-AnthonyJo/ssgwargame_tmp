package SSG.SSGWargame.Controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Account {

    @GetMapping("/Account")
    public List<Account> readAccounts(@RequestParam(value = "ID", defaultValue = "")) {

    }

    @PostMapping("/Account")
    public Account createAccounts() {

    }

    @PutMapping("/Account")
    public Account updateAccounts() {

    }

    @DeleteMapping("/Account")
    public Account deleteAccounts() {

    }
}
