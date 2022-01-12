package by.leverx.petodatarabbitmqmicroservices.oDataService;

import org.apache.olingo.odata2.api.ODataServiceFactory;
import org.apache.olingo.odata2.core.rest.ODataRootLocator;

import javax.ws.rs.Path;

@Path("/")
public class OrdersRootLocator extends ODataRootLocator {
    private OrdersOdataJPAServiceFactory serviceFactory;
    public OrdersRootLocator(OrdersOdataJPAServiceFactory serviceFactory) {
        this.serviceFactory = serviceFactory;
    }

    @Override
    public ODataServiceFactory getServiceFactory() {
        return this.serviceFactory;
    }
}
