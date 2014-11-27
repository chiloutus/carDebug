package com.garylynam.carDebugApp;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by GaryPC on 04/11/2014.
 */
public class SplashPage extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
    }

   /*  public void selectBlueTooth(View view){
        ArrayList deviceStrs = new ArrayList<String>();
        final ArrayList devices = new ArrayList<String>();
        BluetoothDevice blueDevice;

        BluetoothAdapter btAdapter = BluetoothAdapter.getDefaultAdapter();
        Set pairedDevices = btAdapter.getBondedDevices();
        if (pairedDevices.size() > 0)
        {
            for (Object device : pairedDevices)
            {
                blueDevice = (BluetoothDevice) device;
                deviceStrs.add(blueDevice.getName() + "\n" + blueDevice.getAddress());
                devices.add(blueDevice.getAddress());
            }
        }

        // show list
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.select_dialog_singlechoice,
                deviceStrs.toArray(new String[deviceStrs.size()]));

        alertDialog.setSingleChoiceItems(adapter, -1, new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
                int position = ((AlertDialog) dialog).getListView().getCheckedItemPosition();
                String deviceAddress = devices.get(position).toString();
                BluetoothAdapter btAdapter = BluetoothAdapter.getDefaultAdapter();

                BluetoothDevice device = btAdapter.getRemoteDevice(deviceAddress);

                UUID uuid = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");

                BluetoothSocket socket = null;

                try {
                    socket = device.createInsecureRfcommSocketToServiceRecord(uuid);
                    socket.connect();



               new EchoOffObdCommand().run(socket.getInputStream(), socket.getOutputStream());

                new LineFeedOffObdCommand().run(socket.getInputStream(), socket.getOutputStream());

                new TimeoutObdCommand().run(socket.getInputStream(), socket.getOutputStream());

                new SelectProtocolObdCommand(ObdProtocols.AUTO).run(socket.getInputStream(), socket.getOutputStream());

                EngineRPMObdCommand engineRpmCommand = new EngineRPMObdCommand();
                SpeedObdCommand speedCommand = new SpeedObdCommand();
                while (!Thread.currentThread().isInterrupted())
                {
                    engineRpmCommand.run(sock.getInputStream(), sock.getOutputStream());
                    speedCommand.run(sock.getInputStream(), sock.getOutputStream());
                    // TODO handle commands result
                    Log.d(TAG, "RPM: " + engineRpmCommand.getFormattedResult());
                    Log.d(TAG, "Speed: " + speedCommand.getFormattedResult());
                }
               } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });

        alertDialog.setTitle("Choose Bluetooth device");
        alertDialog.show();

    }*/

}