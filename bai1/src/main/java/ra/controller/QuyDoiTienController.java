package ra.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("quyDoiTienController")
public class QuyDoiTienController {
    @GetMapping("tiente")
    public String doiTienTe(Model mode, @RequestParam(defaultValue = "0")
    Integer usd,
                           @RequestParam(defaultValue = "0")
                           Integer vnd) {
        if (usd == 0) {
            float tien = vnd / 23000;
            mode.addAttribute("usd", tien);
        } else if (vnd == 0) {
            float tien = usd * 23000;
            mode.addAttribute("vnd", tien);
        }
        return "quyDoiTien";
    }
}

