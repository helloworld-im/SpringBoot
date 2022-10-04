@Controller

@RequestMapping("/employee")

public class EmployeeInfoController {

    @RequestMapping(value = "", method = RequestMethod.GET)

    public Model searchEmployeeInfo(Model model, @RequestParam("id") String employeeId) {

   // body

    }

}
