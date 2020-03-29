package gHost.promocarouselapi.service;

import gHost.promocarouselapi.exception.ResourceNotFoundException;
import gHost.promocarouselapi.model.User;
import gHost.promocarouselapi.repository.UserRepository;
import gHost.promocarouselapi.response.UserModuleResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserModuleService {

    @Autowired
    UserRepository userRepository;

    public ResponseEntity<Map<String, List<UserModuleResponse>>> getModuleByUserId(Long userId) throws ResourceNotFoundException {

        Map<String, List<UserModuleResponse>> response = new HashMap<>();
        List<UserModuleResponse> userModuleResponse = new ArrayList<>();

        User user = userRepository
                .findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not Found on id : " + userId));

        user.getUserModules().forEach(userModule -> {
            userModuleResponse.add(new UserModuleResponse(userModule));
            userModuleResponse.sort(Comparator.comparing(UserModuleResponse::getModuleOrder));
        });

        response.put("module", userModuleResponse);
        return ResponseEntity.ok().body(response);
    }
}
