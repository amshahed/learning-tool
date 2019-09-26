#include <bits/stdc++.h>
#define mx 100001
using namespace std;

int arr[mx], tree[mx*3], lazy[mx*3];

void update(int node, int start, int end, int l, int r){
    int left = node*2;
    int right = left+1;
    if (lazy[node]){
        tree[node] += (end-start+1)*lazy[node];
        if (start!=end){
            lazy[left] += lazy[node];
            lazy[right] += lazy[node];
        }
        lazy[node] = 0;
    }
    if (start>r || end<l)   return;
    if (start>=l && end<=r){
        tree[node] += end-start+1;
        if (start!=end){
            lazy[left] += 1;
            lazy[right] += 1;
        }
    }
    int mid = (start+end)>>1;
    update(left, start, mid, l, r);
    update(right, mid+1, end, l, r);
    tree[node] = tree[left] + tree[right];
}

int query(int node, int start, int end, int l, int r){
    if (start>r || end<l) return 0;
    int left = node<<1;
    int right = left+1;
    
    if (lazy[node]){
        tree[node] += end-start+1;
        if (start!=end){
            lazy[left] += 1;
            lazy[right] += 1;
        }
        lazy[node] = 0;
    }
    if (start==end) return tree[node]%3 ? 0 : 1;
    int mid = (start+end)>>1;
    return query(left, start, mid, l, r)+query(right, mid+1, end, l, r);
}

int main(){
    int t, n, q, a, b, c;
    scanf("%d", &t);
    for (int j=1; j<=t; j++){
        memset(arr, 0, sizeof(arr));
        memset(tree, 0, sizeof(tree));
        memset(lazy, 0, sizeof(lazy));
        scanf("%d %d", &n, &q);
        printf("Case %d:\n", j);
        while(q--){
            scanf("%d %d %d", &a, &b, &c);
            if (a==0) update(1, 1, n, b+1, c+1);
            else printf("%d\n", query(1, 1, n, b+1, c+1));
        }
    }
}