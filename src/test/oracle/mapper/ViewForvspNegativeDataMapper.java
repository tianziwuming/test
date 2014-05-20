package test.oracle.mapper;

import java.util.List;

import test.oracle.domain.ViewForvspNegativeData;
import test.oracle.domain.ViewForvspNegativeDataExample;

public interface ViewForvspNegativeDataMapper {
    int countByExample(ViewForvspNegativeDataExample example);

   // int deleteByExample(ViewForvspNegativeDataExample example);

    //int insert(ViewForvspNegativeData record);

    //int insertSelective(ViewForvspNegativeData record);

    List<ViewForvspNegativeData> selectByExample(ViewForvspNegativeDataExample example);

}