package com.eddarmitage.seeds.packets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PacketController {

    private static final Logger logger = LoggerFactory.getLogger(PacketController.class);

    @GetMapping("/")
    public String index() {
        logger.debug("Handling request");
        return "Hi.";
    }
}
