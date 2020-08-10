package com.guoquan.action.other.demo;

import java.util.Optional;

/**
 * @ClassName: OptionalDemo
 * @Package: com.guoquan.action.other.demo
 * @Description:
 * @Datetime: 2020/8/10 9:14
 * @Author: wuyunfeng
 */
public class OptionalDemo {


    public static void main(String[] args) {


//        optionalTest3(null);
//        optionalTest4(null);
        optionalTest5();

    }

    static void optionalTest1() {
        Company company = Company.builder().name("Apple").build();
        Optional<Company> optCompany = Optional.ofNullable(company);
        optCompany.ifPresent(value -> System.out.println(value.getName()));
    }

    static void optionalTest2() {
        Company company = Company.builder().name("Apple").build();
        Optional<Company> optCompany = Optional.ofNullable(company);
        optCompany.filter(company1 -> "Apple".equals(company.getName()))
                .ifPresent(company1 -> System.out.println("ok"));
    }

    @SuppressWarnings("SameParameterValue")
    static void optionalTest3(Company company) {
        Optional<Company> companyOpt = Optional.ofNullable(company);
        // 设置默认值
        String name = companyOpt.orElseThrow(RuntimeException::new).getName();
        System.out.println(name);

    }

    @SuppressWarnings("SameParameterValue")
    static void optionalTest4(Company company) {
        Optional<Company> companyOpt = Optional.ofNullable(company);
        // 设置默认值
        String name = companyOpt.orElse(Company.builder().name("Unknown").build()).getName();
        System.out.println(name);

    }

    @SuppressWarnings("SameParameterValue")
    static void optionalTest5() {
        Optional<Company> companyOpt = Optional.ofNullable(Company.builder().name("Apple").build());
        // 设置默认值
        Optional<String> nameOpt = companyOpt.map(Company::getName);
        System.out.println(nameOpt.get());

    }


}
