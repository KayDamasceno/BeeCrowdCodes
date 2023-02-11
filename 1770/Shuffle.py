while True:


    try:

        m, k = map(int, input().split())

        minutes = input().split()
        songs = input().split()
        songsHeard = []

        minutesHeard = 0
        
        for x in range(0,k):
            if len(songsHeard) >= m:
                break
            else:
                if songs[x] not in songsHeard:
                    songsHeard.append(songs[x])

                minutesHeard+=int(minutes[int(songs[x])-1])
                  
        if len(songsHeard) < m:
            print(-1)
        else:
            print(minutesHeard)
    except EOFError:
        break
