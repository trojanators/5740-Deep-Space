import networktables as NetworkTable
from opencv import distance
import logging


logging.basicConfig(level=logging.DEBUG) # enables logging for pynetworktables
NetworkTable.setIPAddress("roboRIO-5740-FRC.local")
NetworkTable.setClientMode()
NewtorkTable.initialize()
table = NetworkTable.getTable("ContoursReport")

while True:
    if len() > 0:
        table.putNumber('isTarget', 1)
        table.putNumber('Distance', distance/12)
    else:
        table.putNumber('isTarget', 0)
        table.putNumber('Disance', -1)