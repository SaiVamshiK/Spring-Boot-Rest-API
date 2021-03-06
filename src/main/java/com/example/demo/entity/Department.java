package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    // @Entity specifies that department is the table in data jpa
    // id is the primary key for the department table
//    @Data is a convenient annotation that combines the features of the following annotations:
//
//    @ToString
//    @EqualsAndHashCode
//    @Getter
//    @Setter
//    @RequiredArgsConstructor
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentID;
    @NotBlank(message = "Please add department name...")
//    @NotNull
//    @Length(min = 0,max = 23)
//    @Positive
//    @Negative
//    @PositiveOrZero
//    @NegativeOrZero
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
    // refer this : https://thorben-janssen.com/jpa-generate-primary-keys/ for generating values for primary keys

//    @Override
//    public String toString() {
//        return "Department{" +
//                "departmentID=" + departmentID +
//                ", departmentName='" + departmentName + '\'' +
//                ", departmentAddress='" + departmentAddress + '\'' +
//                ", departmentCode='" + departmentCode + '\'' +
//                '}';
//    }
//
//    public Long getDepartmentID() {
//        return departmentID;
//    }
//
//    public void setDepartmentID(long departmentID) {
//        this.departmentID = departmentID;
//    }
//
//    public String getDepartmentName() {
//        return departmentName;
//    }
//
//    public void setDepartmentName(String departmentName) {
//        this.departmentName = departmentName;
//    }
//
//    public String getDepartmentAddress() {
//        return departmentAddress;
//    }
//
//    public void setDepartmentAddress(String departmentAddress) {
//        this.departmentAddress = departmentAddress;
//    }
//
//    public String getDepartmentCode() {
//        return departmentCode;
//    }
//
//    public void setDepartmentCode(String departmentCode) {
//        this.departmentCode = departmentCode;
//    }
//
//    public Department(long departmentID, String departmentName, String departmentAddress, String departmentCode) {
//        this.departmentID = departmentID;
//        this.departmentName = departmentName;
//        this.departmentAddress = departmentAddress;
//        this.departmentCode = departmentCode;
//    }
//
//    public Department() {
//    }
}
