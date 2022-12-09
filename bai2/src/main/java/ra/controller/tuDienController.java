
package ra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("tuDienAnhVietController")
public class tuDienController {
    public static String[] english = {"hi", "one", "true"};
    public static String[] vi = {"chào", "một", "hai"};



    @PostMapping("tuDien123")
    public String tuDienv(Model model, String tudich) {
        for (int i = 0; i < english.length; i++) {
            if (tudich.equals(english[i])) {
                String tuDien = vi[i];
                model.addAttribute("ra", tuDien);
                break;
            } else {
                String tuDien = "kết quả này tôi không có";
                model.addAttribute("ra", tuDien);
            }
        }
        return "tuDien";
    }
}

