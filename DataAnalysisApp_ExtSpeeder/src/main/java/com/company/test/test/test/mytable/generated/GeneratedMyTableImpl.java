package com.company.test.test.test.mytable.generated;

import com.company.test.test.test.mytable.MyTable;
import com.speedment.Speedment;
import com.speedment.internal.core.code.AbstractBaseEntity;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;
import javax.annotation.Generated;

/**
 * The generated base implementation representing an entity (for example, a
 * row) in the Table test.test.test.myTable.
 * <p>
 * This file has been automatically generated by Ext Speeder. Any changes
 * made to it will be overwritten.
 * 
 * @author Ext Speeder
 */
@Generated("Ext Speeder")
public abstract class GeneratedMyTableImpl extends AbstractBaseEntity<MyTable> implements MyTable {
    
    private Integer id;
    private Integer value;
    private String date;
    private String person;
    private String country;
    private String company;
    private Integer quantity;
    
    protected GeneratedMyTableImpl() {
        
    }
    
    @Override
    public Integer getId() {
        return id;
    }
    
    @Override
    public Optional<Integer> getValue() {
        return Optional.ofNullable(value);
    }
    
    @Override
    public Optional<String> getDate() {
        return Optional.ofNullable(date);
    }
    
    @Override
    public Optional<String> getPerson() {
        return Optional.ofNullable(person);
    }
    
    @Override
    public Optional<String> getCountry() {
        return Optional.ofNullable(country);
    }
    
    @Override
    public Optional<String> getCompany() {
        return Optional.ofNullable(company);
    }
    
    @Override
    public Optional<Integer> getQuantity() {
        return Optional.ofNullable(quantity);
    }
    
    @Override
    public final MyTable setId(Integer id) {
        this.id = id;
        return this;
    }
    
    @Override
    public final MyTable setValue(Integer value) {
        this.value = value;
        return this;
    }
    
    @Override
    public final MyTable setDate(String date) {
        this.date = date;
        return this;
    }
    
    @Override
    public final MyTable setPerson(String person) {
        this.person = person;
        return this;
    }
    
    @Override
    public final MyTable setCountry(String country) {
        this.country = country;
        return this;
    }
    
    @Override
    public final MyTable setCompany(String company) {
        this.company = company;
        return this;
    }
    
    @Override
    public final MyTable setQuantity(Integer quantity) {
        this.quantity = quantity;
        return this;
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("id = "+Objects.toString(getId()));
        sj.add("value = "+Objects.toString(getValue().orElse(null)));
        sj.add("date = "+Objects.toString(getDate().orElse(null)));
        sj.add("person = "+Objects.toString(getPerson().orElse(null)));
        sj.add("country = "+Objects.toString(getCountry().orElse(null)));
        sj.add("company = "+Objects.toString(getCompany().orElse(null)));
        sj.add("quantity = "+Objects.toString(getQuantity().orElse(null)));
        return "MyTableImpl "+sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof MyTable)) { return false; }
        final MyTable thatMyTable = (MyTable)that;
        if (!Objects.equals(this.getId(), thatMyTable.getId())) {return false; }
        if (!Objects.equals(this.getValue(), thatMyTable.getValue())) {return false; }
        if (!Objects.equals(this.getDate(), thatMyTable.getDate())) {return false; }
        if (!Objects.equals(this.getPerson(), thatMyTable.getPerson())) {return false; }
        if (!Objects.equals(this.getCountry(), thatMyTable.getCountry())) {return false; }
        if (!Objects.equals(this.getCompany(), thatMyTable.getCompany())) {return false; }
        if (!Objects.equals(this.getQuantity(), thatMyTable.getQuantity())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(getId());
        hash = 31 * hash + Objects.hashCode(getValue());
        hash = 31 * hash + Objects.hashCode(getDate());
        hash = 31 * hash + Objects.hashCode(getPerson());
        hash = 31 * hash + Objects.hashCode(getCountry());
        hash = 31 * hash + Objects.hashCode(getCompany());
        hash = 31 * hash + Objects.hashCode(getQuantity());
        return hash;
    }
    
    @Override
    public Class<MyTable> entityClass() {
        return MyTable.class;
    }
}