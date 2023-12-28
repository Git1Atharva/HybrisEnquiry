package org.training.core.enquiryService;

import org.training.core.model.EnquiryFormModel;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

public class EnquiryImpl implements EnquiryService {

    @Resource
    private ModelService modelService;

    @Override
    public void saveData(EnquiryFormModel enquiryForm) {
        EnquiryFormModel enquiry = modelService.create(EnquiryFormModel.class);
        enquiry.setFirstName(enquiryForm.getFirstName());
        enquiry.setLastName(enquiryForm.getLastName());
        enquiry.setEmail(enquiryForm.getEmail());
        enquiry.setAge(enquiryForm.getAge());
        modelService.save(enquiry);
        System.out.println("Data saved");

    }

}
