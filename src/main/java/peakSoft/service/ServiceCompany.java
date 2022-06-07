package peakSoft.service;

import org.springframework.stereotype.Service;
import peakSoft.model.Company;

import java.util.List;

@Service
public interface ServiceCompany {
    void save(Company company);

    List<Company> getCompanies();

    Company getCompanyById(Long id);

    void deleteCompany(Long id);

    void updateCompany(Long id,Company updatedCompany);
}
