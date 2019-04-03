import grip 
import visioncheck
from networktables import NetworkTables
class main:
        grip.grip.__init__
        grip.grip.process
        NetworkTables.initialize(server='localhost')
        vision = NetworkTables.getTable("Root/Vision")
        


  




 