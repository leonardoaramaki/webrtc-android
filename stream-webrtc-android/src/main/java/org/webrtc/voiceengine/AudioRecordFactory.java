package org.webrtc.voiceengine;

import android.media.AudioRecord;

public interface AudioRecordFactory {
  AudioRecord create(int audioSource, int sampleRate, int channelConfig, int audioFormat, int bufferSize);
}
