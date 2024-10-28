package SYSC4806;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Optional;

@Controller
public class UIController {

    private final AddressBookRepository addressBookRepository;

    @Autowired
    public UIController(AddressBookRepository addressBookRepository) {
        this.addressBookRepository = addressBookRepository;
    }

    @GetMapping("/UI")
    public String greeting(@RequestParam("bookId") int id, Model model) {
        Optional<AddressBook> bookOpt = addressBookRepository.findById(id);

        if (bookOpt.isPresent()) {
            AddressBook book = bookOpt.get();
            model.addAttribute("addressBook", book);
            return "UI";
        } else {
            model.addAttribute("errorMessage", "Address Book not found");
            return "error";
        }
    }
}
