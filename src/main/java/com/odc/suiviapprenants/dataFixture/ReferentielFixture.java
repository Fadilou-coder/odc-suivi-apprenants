package com.odc.suiviapprenants.dataFixture;

import com.odc.suiviapprenants.model.Referentiel;
import com.odc.suiviapprenants.repository.GroupeCompetenceRepository;
import com.odc.suiviapprenants.repository.ReferentielRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@AllArgsConstructor
@Component
@ConditionalOnProperty(name = "app.db-init", havingValue = "true")
@Order(9)
public class ReferentielFixture implements CommandLineRunner {
    private ReferentielRepository referentielRepository;
    private GroupeCompetenceRepository groupeCompetenceRepository;

    @Override
    public void run(String... args) throws Exception {
        for(int i=0;i < 15;i++ ){
            referentielRepository.save(new Referentiel("ref"+i,"description"+i,"crictereDev"+i,"crictereAdmin"+i,groupeCompetenceRepository.findAll()));
        }
    }
}
