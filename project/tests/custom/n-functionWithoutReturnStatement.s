main {
	print ?T?fibonacci( 13 );
	return;
};

fdef fibonacci( pos : int ) { 
	if (pos = -1) then
		return 0;
	fi
	if (pos = 0) then
		return 1;
	fi	
	
} : int ;
