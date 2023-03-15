import * as React from 'react';
import { StyleSheet, View, Button } from 'react-native';
import RNKill from 'rn-kill';

export default function App() {
  const onPress = () => {
    RNKill.exitApp();
  };

  return (
    <View style={styles.container}>
      <Button title="Kill the application" onPress={onPress} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
