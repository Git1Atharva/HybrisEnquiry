package org.training.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.acceleratorstorefrontcommons.forms.RegisterForm;
import de.hybris.platform.commercefacades.user.data.RegisterData;
import de.hybris.platform.servicelayer.model.MockModelService;
import de.hybris.platform.servicelayer.model.ModelService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import de.hybris.platform.servicelayer.model.ModelService;
import org.training.core.model.EnquiryFormModel;
import org.training.facades.enquiry.EnquiryFormInterface;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestParam;
import javax.annotation.Resource;

@Controller
@RequestMapping(value = "/form")
public class MyController extends AbstractPageController {

    @Resource(name = "enquiryFormFacade")
    private EnquiryFormInterface enquiryformfacade;



    @RequestMapping(value = "/saveContactDetails",method = RequestMethod.POST)
    public String displaycontactdetails( @ModelAttribute("registerForm") final EnquiryFormModel enquiryForm,
                                         final BindingResult bindingResult,
                                         final Model model){

        enquiryformfacade.saveEnquiryForm(enquiryForm);

        System.out.println("Data saved");

        return "pages/myJspPage";

    }
}
