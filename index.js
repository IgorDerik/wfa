let data = [53, 66, 97, 48, 47, 72, 16, 86, 12, 59, 77, 51, 53, 97, 32, 3, 35, 51, 7, 98];
let maxWeight = 100;
NFA(data, maxWeight);
FFA(data, maxWeight);
WFA(data, maxWeight);

function NFA(data, maxWeight) {
    let count = 0;
    let containers = Array(data.length);
    for(let i=0; i<containers.length; i++) {
        containers[i] = 100;
    }

    for (let i = 0; i < data.length; i++) {
        if(containers[count] >= data[i]) {
            containers[count] -= data[i];
        } else {
            ++count;
            containers[count] -= data[i];
        }
    }
    let body = document.getElementsByTagName('body')[0];
    let textNFA = document.createElement('textarea');
    textNFA.rows="10";
    textNFA.cols="30";
    textNFA.value += "NFA:   ";
    textNFA.value += "count of boxes: "+(count+1)+"  ";
    textNFA.value += "count of comparison: "+(data.length)+"   ";
    document.body.appendChild(textNFA);
}

function FFA(data, maxWeight) {
    let count = 0;
    let containers = Array(data.length);
    for(let i=0; i<containers.length; i++) {
        containers[i] = 100;
    }

    for (let i = 0; i < data.length; i++) {
        if(containers[count] >= data[i]) {
            containers[count] -= data[i];
        } else {
            let answer = false;
            for(let j=0; j<count; j++) {
                if(containers[j] >= data[i]) {
                    containers[j] -= data[i];
                    answer = true;
                    break;
                }
            }
            if(!answer) {
                ++count;
                containers[count] -= data[i];
            }
        }
    }
    let body = document.getElementsByTagName('body')[0];
    let textFFA = document.createElement('textarea');
    textFFA.rows="10";
    textFFA.cols="30";
    textFFA.value += "FFA:   ";
    textFFA.value += "count of boxes: "+(count+1)+"  ";
    textFFA.value += "count of comparison: "+(data.length*(data.length-1))+"   ";
    document.body.appendChild(textFFA);
}


function WFA(data, maxWeight) {
    let count = 0;
    let containers = Array(data.length);
    for(let i=0; i<containers.length; i++) {
        containers[i] = 100;
    }

    for (let i = 0; i < data.length; i++) {
        if(containers[count] >= data[i]) {
            containers[count] -= data[i];
        } else {
            let canTakeContainerIndex = maxEmpty(containers, count);
            if(containers[canTakeContainerIndex] >= data[i]) {
                containers[canTakeContainerIndex] -= data[i];
            } else {
                ++count;
                containers[count] -= data[i];
            }
        }
    }
    let body = document.getElementsByTagName('body')[0];
    let textWFA = document.createElement('textarea');
    textWFA.rows="10";
    textWFA.cols="30";
    textWFA.value += "WFA:   ";
    textWFA.value += "count of boxes: "+(count+1)+"  ";
    textWFA.value += "count of comparison: "+(data.length*(data.length-1))+"   ";
    document.body.appendChild(textWFA);
}

function maxEmpty(data, counter) {
    let arr = data.slice();
    let max = arr[0];
    let maxIndex = 0;
    for(let i=1; i<counter; i++) {
        if(arr[i]>max) {
            max=arr[i];
            maxIndex=i;
        }
    }
    return maxIndex;
}

