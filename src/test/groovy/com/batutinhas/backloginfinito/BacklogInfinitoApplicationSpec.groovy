package com.batutinhas.backloginfinito

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class BacklogInfinitoApplicationSpec extends Specification {

    def "O contexto do Spring deve subir sem problemas"() {
        expect: "O contexto ter carregado com sucesso"
    }
}
