package com.fan.Itest;

import com.fan.TestMapper.TestM;
import com.fan.porp.FactotyTest;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class testDao {
    @Test
    public  void test(){
        SqlSession session = FactotyTest.getSession();
        ITestM mapper = session.getMapper(ITestM.class);
        List<TestM> testM = mapper.getTestM();
        for (TestM m : testM) {
            System.out.println(m);
        }
    }
}
