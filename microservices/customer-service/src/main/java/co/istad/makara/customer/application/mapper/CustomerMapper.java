package co.istad.makara.customer.application.mapper;


import co.istad.makara.common.domain.valueobject.CustomerId;
import co.istad.makara.customer.application.dto.create.CreateCustomerRequest;
import co.istad.makara.customer.domain.command.CreateCustomerCommand;
import org.mapstruct.Mapper;

import java.util.UUID;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
    CreateCustomerCommand createCustomerRequestToCreateCustomerCommand
            (CustomerId customerId, CreateCustomerRequest createCustomerRequest);
}
