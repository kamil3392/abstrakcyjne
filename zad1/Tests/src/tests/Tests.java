/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

/**
 *
 * @author Kamil
 */
public class Tests {
    
        static public void TestExporter()
        {
            String textToBeExported = "Ala ma kota";
            Exporter exporter = new TextExporter(textToBeExported);
            Data exportedData = exporter.ExportData(); 
            String exportedText = exportedData.Text();
            
            
            if(textToBeExported.equals(exportedText)){
                System.out.println("TestExporter textToBeExported.equals(exportedText) nr 1 is equals");
            }
            exportedData = exporter.ExportData();
            exportedText = exportedData.Text();
            textToBeExported = "";
            // Assert.AreEqual(textToBeExported, exportedText);
            if(textToBeExported.equals(exportedText)){
                System.out.println("TestExporter textToBeExported.equals(exportedText) nr 2 is equals");
            }
        }
        
        static public void TestImporter()
        {
            String textToBeImported = "Ala zgubila dolara";
            Data dataToSendToImporter = new TextData(textToBeImported);
            Importer importer = new TextImporter();
            importer.ImportData(dataToSendToImporter);
            String dataSavedInImporter = importer.ImportedText();
            
            if(textToBeImported.equals(dataSavedInImporter)){
                System.out.println("TestImporter textToBeImported.equals(dataSavedInImporter) is equals");
            }
            
        }
    
        static public void TestFactory()
        {
            final String textToForFactory = "Ali kot zjadl dolara";
            DistributedModuleFactory factory = new DistributedModuleTextFactory(textToForFactory);
            Data dataFromFactory = factory.CreateData();
            String textFromModule = dataFromFactory.Text();
            //Assert.AreEqual(textToForFactory, textFromModule);
            if(textToForFactory.equals(textFromModule)){
                System.out.println("TestFactory nr 1 textToForFactory.equals(textFromModule) is equals");
            }
            Exporter exporter = factory.CreateExporter();
            textFromModule = exporter.ExportData().Text();
            
            if(textToForFactory.equals(textFromModule)){
                System.out.println("TestFactory nr 2 textToForFactory.equals(textFromModule) is equals");
            }
            Importer importer = factory.CreateImporter();
            //Assert.IsTrue(importer is TextImporter);
        }
    public static void main(String[] args) {
        // TODO code application logic here
        
      TestExporter();
      TestImporter();
      TestFactory();
    }
    
}