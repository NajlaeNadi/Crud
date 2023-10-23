package com.SpringBoot.DemoApplication.DAQ;


import com.SpringBoot.DemoApplication.Model.Prod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public interface ProdRepo  extends JpaRepository<Prod,Integer> {



}
