var storyModule = angular.module('Story', ['StorySecond']);

storyModule.controller('MainCtrl', function(StoryModel) {

    console.log("MainCtr");
    //var maina = this;
    //main.stories = StoryModel.getStories();
    this.tempTitle = "haha";
    this.stories = StoryModel.getStories();
    this.currentStory = null;

    this.setCurrentStory = function(story) {
        this.currentStory = story;
        this.copiedStory = angular.copy(this.currentStory);
        this.tempTitle = "hoho";
    };

    this.changeStory = function(story) {
    };

    this.insertStory = function(story) {
        this.stories.push(story);
    };

    this.showStories = function() {
        console.log(this.stories);
    }

});

storyModule.controller('SubCtrl', function() {

    console.log("SubCtrl");

    this.subCtrlDesc = "This is subCtrl";

    this.getSubCtrlDesc = function() {
        return "This is getSubStrlDesc";
    }
});

storyModule.service('StoryModel', function() {
    var service = this,
        stories = [
         {
             title : '첫번째 이야기',
             status : '완결',
             type : '전래동화',
             speaker : '동네 어르신들',
             desc : '재미있다'
         },
         {
             title : '두번째 이야기',
             status : '완결',
             type : '서프라이즈',
             speaker : 'MBC',
             desc : '역사공부'
         },
         {
             title : '세번째 이야기',
             status : '진행중',
             type : '선거와 정치',
             speaker : '국민',
             desc : '국회의원은 봉사하는 자리이다'
         }
        ];

    service.getStories = function() {
        return stories;
    };
});

