package com.t8medialibrary.enterprise;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlantDiaryController {

    @RequestMapping("/")
    public String index(){
        return "start";
    }

}
