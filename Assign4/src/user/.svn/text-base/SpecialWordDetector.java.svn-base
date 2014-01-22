package user;

import java.util.ArrayList;
import detectors.Detector;

public class SpecialWordDetector {

	private ArrayList<Detector> detectorList = new ArrayList<Detector>();
	
	public SpecialWordDetector() throws Exception{
			ArrayList<Detector> _newDetectorList = LoadDetectors.getLoadDectectorInstance().getDetectorList();
				for(Detector detector : _newDetectorList){
					detectorList.add(detector);
			}
	 }
	
	public boolean isSpecialWord(String word){
		for(Detector _detector : detectorList){
				if(_detector.isSpecialWord(word))
					return true;
			}
			return false;
	}
}
