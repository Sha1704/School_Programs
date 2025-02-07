def prune_list(list1, int1 = 2):
    if int1 <= 0:
        int1 = 2

    list2 = []
    for i in range(int1 -1, len(list1), int1):
        list2.append(list1[i])
    return list2

def prune_list2(list1, int1 = 2):
    if int1 <=0:
        int1 = 2

    list2 = [list1[i] for i in range(int1 -1, len(list1), int1)]
    return (list2)

def check_for_item(list3, val1):
    for i in list3:
        if val1 in list3:
            return True
        else:
            return False
        
def set_up_dictionary(list4):
    dict1 = {}
    index1 = 0

    for i in list4:
        dict1.update({i: index1})
        index1 +=1
    return dict1
