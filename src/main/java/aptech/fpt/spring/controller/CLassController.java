package aptech.fpt.spring.controller;
import aptech.fpt.spring.entity.AttendanceSlots;
import aptech.fpt.spring.entity.Product;
import aptech.fpt.spring.entity.ProductValidator;
import aptech.fpt.spring.model.ClassModel;
import aptech.fpt.spring.model.ProductModel;
import aptech.fpt.spring.model.ProductModel2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Calendar;
import java.util.Optional;

@Controller
public class CLassController {
    @Autowired
    private ClassModel classModel;

    @RequestMapping(path = "/product/list", method = RequestMethod.GET)
    public String getList(Model model, @RequestParam(defaultValue = "1") int page, @RequestParam(defaultValue = "10") int limit) {
        Page<AttendanceSlots> pagination = classModel.findAll(PageRequest.of(page-1, limit));
        model.addAttribute("pagination", pagination);
        model.addAttribute("page", page);
        model.addAttribute("limit", limit);
        model.addAttribute("datetime", Calendar.getInstance().getTime());
        return "product-list";
    }
}
