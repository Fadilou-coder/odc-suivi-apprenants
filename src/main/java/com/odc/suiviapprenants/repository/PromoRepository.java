package com.odc.suiviapprenants.repository;
import com.odc.suiviapprenants.model.Promo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PromoRepository extends JpaRepository<Promo , Long> {
    List<Promo> findAllByArchiveFalse();
}
