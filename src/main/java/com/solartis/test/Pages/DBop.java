package com.solartis.test.Pages;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

import com.solartis.test.CommonClasses.DatabaseOperation;
import com.solartis.test.common.exception.DatabaseException;

public class DBop {

	@SuppressWarnings("static-access")
	/*public static void main(String[] args) throws DatabaseException 
	{*/
	public void callDB(String Column_Name ,String COl_Value) throws DatabaseException
	{
		DatabaseOperation DB = new DatabaseOperation();
		LinkedHashMap<String, String> ColValuesHashMap =null;
		DB.ConnectionSetup("com.mysql.jdbc.Driver", "jdbc:mysql://192.168.84.225:3700/TestDB_Allrisk", "root", "redhat");
		LinkedHashMap LHM = DB.GetDataObjects("SELECT * FROM test_pomtable");
		Iterator<Entry<Integer, LinkedHashMap<String, String>>> HashMapIterator = LHM.entrySet().iterator();
		while (HashMapIterator.hasNext())
	    {
			Entry<Integer, LinkedHashMap<String, String>> ColWIth_Entry = HashMapIterator.next();
	        Integer  ROwNumber= ColWIth_Entry.getKey();
	        ColValuesHashMap = ColWIth_Entry.getValue();
	        if(ROwNumber == 1)
	        ColValuesHashMap.put(Column_Name, COl_Value);
	        Set<String> keys = ColValuesHashMap.keySet();
			for(String k:keys)
			{
				{
				System.out.println(k+" -- "+ColValuesHashMap.get(k));
				DB.UpdateRow(1, ColValuesHashMap);
				}
			}
	    }
		DB.UpdateTable(LHM);
	}

}
