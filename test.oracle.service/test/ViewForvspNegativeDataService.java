package test;

import java.util.List;

import test.oracle.domain.ViewForvspNegativeData;
import test.oracle.domain.ViewForvspNegativeDataExample;

public interface ViewForvspNegativeDataService {

	 int countByExample(ViewForvspNegativeDataExample example);
	 
	 List<ViewForvspNegativeData> findByExample(ViewForvspNegativeDataExample example);
}
