<!-- VideoStream.vue -->

<template>
  <div>
    <h1>实时视频流</h1>
    <video ref="videoPlayer" width="640" height="480" autoplay></video>
  </div>
</template>

<script>
export default {
  data() {
    return {
      videoSrc: '/video_feed', // 根据你的Flask应用程序更改此URL
    };
  },
  mounted() {
    this.setupVideoStream();
  },
  methods: {
    setupVideoStream() {
      const videoPlayer = this.$refs.videoPlayer;

      const mediaSource = new MediaSource();
      videoPlayer.src = URL.createObjectURL(mediaSource);

      mediaSource.addEventListener('sourceopen', () => {
        const sourceBuffer = mediaSource.addSourceBuffer('video/mp4; codecs="avc1.42E01E"');

        const socket = new WebSocket(`ws://127.0.0.1:5000/video_feed`);

        socket.addEventListener('message', (event) => {
          if (event.data instanceof Blob) {
            sourceBuffer.appendBuffer(event.data);
          }
        });
      });
    },
  },
};
</script>

<style scoped>
/* 在这里添加你的自定义样式 */
</style>
