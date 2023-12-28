package org.training.facades.enquiry;


import de.hybris.platform.servicelayer.model.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.training.core.model.EnquiryFormModel;
import org.training.facades.enquiryFacade.EnquiryFormFacade;
import org.training.core.enquiryService.EnquiryService;

import javax.annotation.Resource;

public class EnquiryFormImpl implements EnquiryFormInterface {

   @Resource(name = "enquiryFormService")
    private EnquiryService enquiryService;
    @Override
    public void saveEnquiryForm(EnquiryFormModel enquiryForm) {
        enquiryService.saveData(enquiryForm);

    }
}


