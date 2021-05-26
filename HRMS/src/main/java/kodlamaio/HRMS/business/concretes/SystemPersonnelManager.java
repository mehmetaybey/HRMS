package kodlamaio.HRMS.business.concretes;

import kodlamaio.HRMS.business.abstracts.SystemPersonnelService;
import kodlamaio.HRMS.core.Utilities.results.*;
import kodlamaio.HRMS.dataAccess.abstracts.SystemPersonnelDao;
import kodlamaio.HRMS.entities.concretes.SystemPersonnel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SystemPersonnelManager implements SystemPersonnelService {


    private SystemPersonnelDao systemPersonnelDao;


    @Autowired
    public SystemPersonnelManager(SystemPersonnelDao systemPersonnelDao) {
        this.systemPersonnelDao = systemPersonnelDao;
    }

    @Override
    public DataResult<List<SystemPersonnel>> getAll() {
        return new SuccessDataResult<List<SystemPersonnel>>(systemPersonnelDao.findAll(), "Sistem personelleri listelendi");
    }

    @Override
    public Result add(SystemPersonnel systemPersonnel) {
        this.systemPersonnelDao.save(systemPersonnel);
        return new SuccessResult("Sistem Personeli Eklendi");
    }

    @Override
    public Result update(SystemPersonnel systemPersonnel) {
        this.systemPersonnelDao.save(systemPersonnel);
        return new SuccessResult("Sistem çalışanı başarıyla güncellendi.");
    }

    @Override
    public Result delete(int id) {
        this.systemPersonnelDao.deleteById(id);
        return new SuccessDataResult<List<SystemPersonnel>>("Sistem çalışanı başarıyla silindi.");
    }

    @Override
    public Result checkSystempersonnelmail(String email) {

        if (checkSystempersonnelmail(email).isSuccess()){

            return new SuccessResult(email + "Sistemde böyle bir e-mail adresi yok eklenebilir");
        }else {
            return new ErrorResult(email + "Bu e posta adresi kullanılmaktadır, lütfen farklı bir mail adresi girin");
        }
    }


    @Override
    public Result checkidentityNumber(String identityNumber) {
        try {this.checkidentityNumber(identityNumber);

            return new SuccessResult("Bu TC kimlik numarası sistemde mevcut değil, kayıt edilebilir");
        }catch (Exception e){
            return new ErrorResult("Bu Tc kimlik numarası sistemde mevcut , kayıt edilemez");
        }
    }
}
