package gHost.promocarouselapi.controller;

import gHost.promocarouselapi.exception.ResourceNotFoundException;
import gHost.promocarouselapi.response.UserModuleResponse;
import gHost.promocarouselapi.service.UserModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
class PromoController {

    @Autowired
    UserModuleService userModuleService;

    @GetMapping("/user/{id}")
    ResponseEntity<Map<String, List<UserModuleResponse>>> getUserModules(@PathVariable Long id) throws ResourceNotFoundException {
        return userModuleService.getModuleByUserId(id);
    }
}
