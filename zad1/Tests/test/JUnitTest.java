import junit.framework.Assert;
import org.junit.Test;
import tests.Data;
import tests.DistributedModuleFactory;
import tests.DistributedModuleTextFactory;
import tests.Exporter;
import tests.Importer;
import tests.TextData;
import tests.TextExporter;
import tests.TextImporter;

public class JUnitTest {
    
        @Test
        public void TestExporter(){
            String textToBeExported = "Ala ma kota";
            Exporter exporter = new TextExporter(textToBeExported);
            Data exportedData = exporter.ExportData();
            String exportedText = exportedData.Text();
            Assert.assertEquals(textToBeExported, exportedText);
            exportedData = exporter.ExportData();
            exportedText = exportedData.Text();
            textToBeExported = "";
            Assert.assertEquals(textToBeExported, exportedText);
        }
 
        @Test
        public void TestImporter(){
            String textToBeImported = "Ala zgubila dolara";
            Data dataToSendToImporter = new TextData(textToBeImported);
            Importer importer = new TextImporter();
            importer.ImportData(dataToSendToImporter);
            String dataSavedInImporter = importer.ImportedText();
            Assert.assertEquals(textToBeImported, dataSavedInImporter);
        }
 
        @Test
        public void TestFactory(){
            final String textToForFactory = "Ali kot zjadl dolara";
            DistributedModuleFactory factory = new DistributedModuleTextFactory(textToForFactory);
            Data dataFromFactory = factory.CreateData();
            String textFromModule = dataFromFactory.Text();
            Assert.assertEquals(textToForFactory, textFromModule);
            Exporter exporter = factory.CreateExporter();
            textFromModule = exporter.ExportData().Text();
            Assert.assertEquals(textToForFactory, textFromModule);
            Importer importer = factory.CreateImporter();
            
        }
}
