package com.company.test.generated;

import com.company.test.InitServlet;
import com.company.test.TestApplication;
import com.company.test.test.test.houses.HousesServlet;
import com.company.test.test.test.people.PeopleServlet;
import com.speedment.Speedment;
import com.speedment.plugin.extspeeder.runtime.standaloneapp.MainSupport;
import javax.annotation.Generated;

/**
 * The generated standalone application representing an entity (for example,
 * a row) in the Project test.
 * <p>
 * This file has been automatically generated by Ext Speeder. Any changes
 * made to it will be overwritten.
 * 
 * @author Ext Speeder
 */
@Generated("Ext Speeder")
public class GeneratedStandaloneMainSupport extends MainSupport<TestApplication> {
    
    public GeneratedStandaloneMainSupport() {
        super(InitServlet::new, "root", "MySQL on localhost:3306");
    }
    
    @Override
    protected void bindRest(Speedment speedment) {
        bindConstant("", "[\"test\"]");
        bindConstant("/test", "[\"test\"]");
        bindConstant("/test/test", "[\"test\"]");
        bindConstant("/test/test/test", "[\"houses\", \"people\"]");
        bindServlet(speedment, "/test/test/test/houses", new HousesServlet());
        bindServlet(speedment, "/test/test/test/people", new PeopleServlet());
    }
}