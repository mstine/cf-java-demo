package com.mattstine.cfdemo.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DeathController {

    Log log = LogFactory.getLog(this.getClass());

    @RequestMapping("/die")
    public void die() {
        log.fatal("Dying!");
        System.exit(1);
    }

}
