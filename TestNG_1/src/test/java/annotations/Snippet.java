package annotations;

import org.testng.annotations.Test;

import xls.ShineXlsReader;

public class Snippet {
	@Test
		public void workWithExcel(){
			ShineXlsReader xls=new ShineXlsReader("TestData.xlsx");
			//ShineXlsReader xls=new ShineXlsReader("src\\annotations\\TestData.xlsx");
			int rowCount = xls.getRowCount("Sheet1");
			int columnCount = xls.getColumnCount("Sheet1");
			System.out.println("row count ="+rowCount);
			System.out.println("col count ="+columnCount);
			
//			for(int i=2;i<=rowCount;i++){
//				for(int j=0;j<columnCount;j++){
//					String cellData = xls.getCellData("Sheet1", j, i);
//					System.out.println(cellData);
//				}
//			}
			
			if(!xls.isSheetExist("EmpNames")){
				xls.addSheet("EmpNames");
		}
		xls.addColumn("EmpNames", "eName");
		xls.setCellData("EmpNames", "eName", 2, "Srinivas Narayan");
		}
	
	
}

