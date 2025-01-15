package org.csystem.app.payment.data.service;

import com.karandev.util.data.repository.exception.RepositoryException;
import com.karandev.util.data.service.DataServiceException;
import org.csystem.app.payment.data.dto.ActiveCustomerDTO;
import org.csystem.app.payment.data.dto.CustomerSaveDTO;
import org.csystem.app.payment.data.mapper.ICustomerMapper;
import org.csystem.app.payment.repository.dal.PaymentAppDataHelper;
import org.csystem.app.payment.repository.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentAppDataService {
    private final PaymentAppDataHelper m_paymentAppDataHelper;
    private final ICustomerMapper m_customerMapper;

    public PaymentAppDataService(PaymentAppDataHelper paymentAppDataHelper, ICustomerMapper customerMapper)
    {
        m_paymentAppDataHelper = paymentAppDataHelper;
        m_customerMapper = customerMapper;
    }

    public void saveCustomer(CustomerSaveDTO customerSaveDTO)
    {
        try {
            m_paymentAppDataHelper.saveCustomer(m_customerMapper.toCustomer(customerSaveDTO));
        }
        catch (RepositoryException ex) {
            throw new DataServiceException("", ex.getCause());
        }
        catch (Throwable ex) {
            throw new DataServiceException("", ex);
        }
    }

    public Optional<ActiveCustomerDTO> findActiveCustomerByUsername(String username)
    {
        try {
            return m_paymentAppDataHelper.findCustomerByUsernameAndActive(username, true).map(m_customerMapper::toActiveCustomerDTO);
        }
        catch (RepositoryException ex) {
            throw new DataServiceException("", ex.getCause());
        }
        catch (Throwable ex) {
            throw new DataServiceException("", ex);
        }
    }
}
