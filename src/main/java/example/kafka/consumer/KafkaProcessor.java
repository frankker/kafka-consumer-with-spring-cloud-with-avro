package example.kafka.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface KafkaProcessor {

  String ALERT_INPUT = "alert-input";
  String ASSET_INPUT = "asset-input";

  @Input(ALERT_INPUT)
  SubscribableChannel processMessage();

  @Input(ASSET_INPUT)
  SubscribableChannel consumeAssetEvent();
}
