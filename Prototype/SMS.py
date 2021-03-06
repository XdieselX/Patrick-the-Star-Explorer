# This is pyserial which is needed to communicate with the dongle
import serial
number = ;
message = ;
# Set up the connection to the dongle
dongle = serial.Serial(port="/dev/ttyUSB0",baudrate=115200,timeout=0,rtscts=0,xonxoff=0)
 
# This sends the command to the dongle
def sendatcmd(cmd):
    dongle.write('AT'+cmd+'r')
 
# put the dongle into text mode
sendatcmd('+CMGF=1')
 
# Set the telephone number we want to send to
sendatcmd('+CMGS=number')
 
# Set the message we want to send
dongle.write(message)
 
# Pass the CTRL+Z character to let the dongle know we're done
dongle.write(chr(26))
 
# Close the connection
dongle.close()
