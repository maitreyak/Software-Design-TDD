package user;

import java.io.File;
import java.util.ArrayList;

import detectors.Detector;

public class LoadDetectors {

	private ArrayList<Detector> detectorsList;
	private static LoadDetectors loadDetectorInstance;
	private String packageLocation;
	private String packageName;
	
	
	private LoadDetectors(){
		detectorsList = new ArrayList<Detector>();
		setPackageLocation("Detectors");
		setPackageName("detectors");
	}
	
	public static LoadDetectors getLoadDectectorInstance(){
	  if(loadDetectorInstance == null){
		  loadDetectorInstance = new LoadDetectors();
	  }
	  return loadDetectorInstance;
	}
	
	public ArrayList <Detector> getDetectorList() throws Exception{
		loadDetectorsList();
		return detectorsList;
	}
	
	private void loadDetectorsList() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		detectorsList.clear();
		String classesLocation = packageLocation + "/" + packageName.replace(".", "/"); 
        String[] listOfFiles = new File(classesLocation).list();
        if (listOfFiles != null){
    	   for (String eachClass : listOfFiles) {
    		   if (eachClass.endsWith(".class")) {
    			  classesLocation.replace("/", ".");
    			  Object object = Class.forName(packageName + "." + eachClass.replace(".class", "")).newInstance();
        		  if(object instanceof Detector){
        			detectorsList.add((Detector)object);
        		  }
               }
          }
       }
		
	}    
	
	void addDetectorToList(Detector newDetector){
	  detectorsList.add(newDetector);
	}
   
	void clearDetectorList(){
      detectorsList.clear();
    }
	
	public void setPackageLocation(String _packageLocation) {
		packageLocation = _packageLocation;
	}
	
	public void setPackageName(String _packageName){
		packageName = _packageName;
	}
}
