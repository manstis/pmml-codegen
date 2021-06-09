package com.anstis.pmml.experiment;

import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import com.anstis.pmml.model.PMML;

public class Main {

    public static void main(String[] args) throws Exception {
        JAXBContext context   = JAXBContext.newInstance(PMML.class );
        Unmarshaller unmarshaller = context.createUnmarshaller();

        InputStream in = Main.class.getResourceAsStream("/experiment/pmml.xml");
        PMML pmml = (PMML) unmarshaller.unmarshal(in);
    }

}
